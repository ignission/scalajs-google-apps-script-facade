#!/bin/bash

cd scala-js-ts-importer

dir_path="../DefinitelyTyped/types/google-apps-script/*"
dirs=`find $dir_path -maxdepth 0 -type f -name google-apps-script.*.d.ts`

fileary=()

for filepath in $dirs; do
  if [ -f $filepath ] ; then
    fileary+=(."$filepath")
  fi
done

for i in ${fileary[@]}; do
  FILE_NAME=`echo $i | awk -F'/' '{print $5}' | awk -F'.' '{print $2}'`
  sbt "run ../DefinitelyTyped/types/google-apps-script/google-apps-script.${FILE_NAME}.d.ts
  ../src/main/scala/facade/${FILE_NAME}.scala facade" 
done

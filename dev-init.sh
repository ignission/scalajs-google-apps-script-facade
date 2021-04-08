#!/usr/bin/env bash
git submodule update -i
mkdir ./.git/modules/DefinitelyTyped/info
cp ./sparse-checkout ./.git/modules/DefinitelyTyped/info/
cd DefinitelyTyped
git config core.sparsecheckout true
git read-tree -mu HEAD

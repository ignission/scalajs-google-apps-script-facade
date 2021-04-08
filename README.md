# google-apps-script-scalajs-facade

A Scala.js facade for the Google Apps Script

This facade is converted from [@types/google-apps-script@1.0.10](https://www.npmjs.com/package/@types/google-apps-script/v/1.0.10)

## Usage

Add the following to your sbt build definition:

    libraryDependencies += "tech.ignission" %%% "google-apps-script-scalajs-facade" % "0.3.0"

## Example

If you want to upload a generated js via command line, may install [clasp](https://github.com/google/clasp/) as following:

    npm install -g @google/clasp



    sbt example/fastOptJS

Thanks for awesome project [sjrd/scala-js-ts-importer](https://github.com/sjrd/scala-js-ts-importer) and [exoego/scala-js-ts-importer](https://github.com/exoego/scala-js-ts-importer)

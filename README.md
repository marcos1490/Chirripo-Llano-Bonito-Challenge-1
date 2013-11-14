Chirripo Llano Bonito Challenge 1
=================================

Create a build script in [Ant](http://ant.apache.org) for the provided Java project. The build process should execute the following steps (or targets): compile, run unit tests, package. If the build is successful an email must be sent to pre-configured email addresses saying the build was successful. If the build fails (compilation failed or at least one unit test failed) an email should be sent to the same recipients but saying that the build failed and include the error (and stack trace if possible). The output package should be a zip file with the name format “BuildMe-YYYYMMDDHHMM.zip” and should be placed in a preconfigured builds folder. The email subject should be “BuildMe-YYYYMMDDHHMM SUCCESS” or “BuildMe-YYYYMMDDHHMM FAIL” depending on whether the build was successful or not.

## Instalation
You need to open the project on Eclipse.
Then go to Preferences -> Ant -> Runtime and add the following libraries:

- /lib/mail.jar

- /lib/activation.jar

Then Right click on the Build.xml file and Run As > Ant Script.

To change the email configuration check the lines 20 to 26.
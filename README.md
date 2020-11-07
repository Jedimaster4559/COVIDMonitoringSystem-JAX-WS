# COVIDMonitoringSystem-JAX-WS
A COVID Monitoring System for classrooms built with JAX-WS.

# Usage
This application is entriely Command Line based. This section of this readme goes over basic command necessary to run the project.
( @Jada When you get to implementing this stuff, you might want to move this section fo the readme into it's own file. It's entirely up to you how to handle that, but we do need to document this part pretty extensively.)

# Project Overview
- COVIDMonitoringShared: Shared resources used accross the whole project. Right now, this is mostly the data model.
- COVIDMonitoringServer: This is the server application that we are using to run this simulation.
- COVIDMonitoringClient: The client application that interacts with the server simulation.

# Development Setup
Follow the configuration steps below to make sure that you are able to work on the development of this project.

## Tools
- Apache Maven
- Java 8
- IntelliJ >2019.3

## Getting Started.
1. Open this Project inside IntelliJ.
1. Run `mvn clean install`. If everything has been configured properly, this step should complete successfully and you
should have no issues indicated from IntelliJ. If this is not successful, let me know ASAP so I can help get those issues resolved.

## Maven Basics
Maven is a build tool that allows us to do a whole bunch of things like package management and simplified building.

To compile/build your code, run `mvn clean install` in this directory. Once this runs, it will create a target directory
with the output from the build. Both the `Client` and `Server` modules are setup to build jars that also pre-package all
of their dependencies and thus once they are build are standalone `.jar` files.

You can also run the different pieces of the application using the provided run scripts in this directory:
- run_client.sh
- run_server.sh
- run_client.bat
- run_server.bat

Note: On MacOS and Linux, you may need to modify the permissions on the scripts to run. To do this, run `sudo chmod +x <filename>`

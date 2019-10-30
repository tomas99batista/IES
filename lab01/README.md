# 1.1)
# Maven Goal 
Each phase is a sequence of goals, and each goal is responsible for a specific task.

When we run a phase – all goals bound to this phase are executed in order.

Here are some of the phases and default goals bound to them:

compiler:compile – the compile goal from the compiler plugin is bound to the compile phase
compiler:testCompile is bound to the test-compile phase
surefire:test is bound to test phase
install:install is bound to install phase
jar:jar and war:war is bound to package phase

The order of the maven goals can be seen on the image that goes along this file. *See ./goal_order.png

# 1.3)
# Recap and cheat sheet
## List Docker CLI commands
docker
docker container --help

## Display Docker version and info
docker --version
docker version
docker info

## Execute Docker image
docker run hello-world

## List Docker images
docker image ls

## List Docker containers (running, all, all in quiet mode)
docker container ls
docker container ls --all
docker container ls -aq


# docker container ls --all
CONTAINER ID        IMAGE                 COMMAND             CREATED             STATUS                        PORTS                                            NAMES
11ef9c6157a2        portainer/portainer   "/portainer"        6 hours ago         Exited (255) 30 minutes ago   0.0.0.0:8000->8000/tcp, 0.0.0.0:9000->9000/tcp   musing_hawking
72d15c4baea0        portainer/portainer   "/portainer"        6 hours ago         Exited (1) 6 hours ago                                                         jolly_saha
1623cc23a80c        hello-world           "/hello"            6 hours ago         Exited (0) 6 hours ago                                                         fervent_galileo

# get base image from my repo
FROM node

MAINTAINER Adam Pratt

# switch to root to install other tools
USER root

# update package mgr
RUN apt-get -y update && apt-get -y upgrade
RUN apt-get install -y curl
RUN curl -sL https://deb.nodesource.com/setup_9.x | bash
# install nodejs
RUN apt-get install -y nodejs
RUN apt-get install -y git 
RUN apt-get install -y subversion

# install angular/cli
RUN npm install -g @angular/cli@6.2.7

# Clean up and remove any unused packages
RUN apt-get clean
RUN apt-get autoremove

ENV envVar1="Look at what I'm doing!!"
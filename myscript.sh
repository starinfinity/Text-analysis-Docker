#!/bin/bash

scp username@hadoop-gate-0.eecs.uc.edu:/path/to/data/* /home/data/
apt-get install -y openjdk-8-jdk
java -classpath /home/data/ *name of your file with java code*

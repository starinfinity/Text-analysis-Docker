# Docker_and_data_analysis
we will use Docker to analyze all the files in a directory.

## TO-DO
We will build a docker to automatically login to a server and fetch the files present in some directory.
It will process those files to Display:

-Total number of text files in the directory and their names.

-Total number of words in text files (all files combined).

-Word (minimum length of word is 5) with highest and lowest frequency.

-Result should change if I change files on hadoop-gate-0 in your directory.


## Instructions:

##### Instruction for newbie 
##### commads with docker before them were used in terminal and command without Docker before were used inside image 


Below are the instruction and descriptions of file in order of their use

1. **creating_auto_ssh_image.txt** - file to create an image to automatically connect you to server using key.

2. **comit_the_container.txt** - file to check the image formed in step 1 and comit it followed by creating docker file.

3. **Docker File** - use to build a docker

4. **myscript.sh** - use to install java and download files for directory in server.

5. **Assignemnt.java** - java file to calculate above mentioned things.

6. use WINSCP and login to your server(hadoop-gate in my case)
   
   6.1. create a directory named 'data'.
   
   6.2. add your code(Assignment.java) and text file

7. **BUILD_AND_RUN.txt** - file with instructions to build, run and download the Docker image. 

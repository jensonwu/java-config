# ~/.profile: executed by the command interpreter for login shells.
# This file is not read by bash(1), if ~/.bash_profile or ~/.bash_login
# exists.
# see /usr/share/doc/bash/examples/startup-files for examples.
# the files are located in the bash-doc package.

# the default umask is set in /etc/profile; for setting the umask
# for ssh logins, install and configure the libpam-umask package.
#umask 022

# if running bash
if [ -n "$BASH_VERSION" ]; then
    # include .bashrc if it exists
    if [ -f "$HOME/.bashrc" ]; then
	. "$HOME/.bashrc"
    fi
fi

# set PATH so it includes user's private bin if it exists
if [ -d "$HOME/bin" ] ; then
    PATH="$HOME/bin:$PATH"
fi

export JRE_HOME=$HOME/language/java/jdk-6
export JAVA_HOME=$HOME/language/java/jdk-6
export GRADLE_HOME=$HOME/language/java/gradle
export GROOVY_HOME=$HOME/language/java/groovy
export ANT_HOME=$HOME/language/java/ant-1.8
export PATH=$JAVA_HOME/bin:$GRADLE_HOME/bin:$GROOVY_HOME/bin:$ANT_HOME/bin:$PATH
export LIBA_ENV_FILE=file:/home/wubofeng/tmp/env.properties

export CLASSPATH=$HOME/language/java/mysql-connector-java/mysql-connector-java.jar:$CLASSPATH
_byobu_sourced=1 . /usr/bin/byobu-launch

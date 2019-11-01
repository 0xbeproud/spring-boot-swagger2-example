pipeline {
  agent {
    docker {
      image 'python:3.6'
    }

  }
  stages {
    stage('test') {
      steps {
        echo 'test'
        sh 'python --version'
      }
    }
    stage('build') {
      steps {
        echo 'build'
        sh 'echo \'python run\''
      }
    }
    stage('request-spot-instance') {
      steps {
        echo 'request spot instance'
        sh '''#!/usr/bin/env python
"""Launches a test spot instance"""

import click
import boto3
import base64

from sensible.loginit import logger
log = logger(__name__)

#Tell Boto3 To Enable Debug Logging
#boto3.set_stream_logger(name=\'botocore\')

@click.group()
def cli():
    """Spot Launcher"""


def user_data_cmds(duration):
    """Initial cmds to run, takes duration for halt cmd"""

    cmds = """
        #cloud-config
        runcmd:
         - echo "halt" | at now + {duration} min
    """.format(duration=duration)
    return cmds

@cli.command("launch")
@click.option(\'--instance\', default="r3.medium", help=\'Instance Type\')
@click.option(\'--duration\', default="55", help=\'Duration\')
@click.option(\'--keyname\', default="datalabs", help=\'Key Name\')
@click.option(\'--profile\', default="arn:aws:iam::561744971673:instance-profile/admin",
                     help=\'IamInstanceProfile\')
@click.option(\'--securitygroup\', default="sg-0226fa17b6476abc9", help=\'Key Name\')
@click.option(\'--ami\', default="ami-0ac5a7ea111fb340b", help=\'Key Name\')
def request_spot_instance(duration, instance, keyname, 
                            profile, securitygroup, ami):
    """Request spot instance"""

    #import pdb;pdb.set_trace()
    user_data = user_data_cmds(duration)
    return user_data

if __name__ == \'__main__\':
    cli()'''
      }
    }
  }
  environment {
    AWS_ACCESS_KEY = 'aws access key'
  }
}
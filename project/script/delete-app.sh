#!/bin/bash
set -ex

curl -X DELETE ${MINIMESOS_MARATHON}/v2/apps/web-app

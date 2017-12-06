#!/bin/bash
set -ex

$(minimesos info | grep MINIMESOS)

curl -X DELETE "${MINIMESOS_MARATHON%;}/v2/apps/web-app"

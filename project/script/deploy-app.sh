#!/bin/bash
set -ex

curl -X POST "${MINIMESOS_MARATHON}/v2/apps" -d @./project/script/marathon-web-app.json -H "Content-type: application/json"

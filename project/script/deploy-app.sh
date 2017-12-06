#!/bin/bash
set -ex

curl -X POST http://localhost:8080/v2/apps -d @./project/script/marathon-web-app.json -H "Content-type: application/json"

from('kamelet:http-source?url=https://raw.githubusercontent.com/amoravek/camelk/main/demo.json&period=5000')
.to('log:info')

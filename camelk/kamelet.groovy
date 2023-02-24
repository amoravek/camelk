from('timer:tick?period=5000')
  .setBody().constant('Hello world from Camel K')
  .to('log:info')

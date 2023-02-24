from('timer:tick?period=1000')
  .bean(cz.trask.camelk.RandomStringsBean.class, "getRandomString(10)")
  .process(new cz.trask.camel.processor.UpperCaseProcessor())
.to('log:info')

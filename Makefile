BASEDIR=$(CURDIR)
OUTPUTDIR=$(BASEDIR)/src/main/java
PACKAGE=tezz.util

html:
	javadoc "$(PACKAGE)" -d "$(OUTPUTDIR)" -encoding UTF-8

.PHONY: html

BASEDIR=$(CURDIR)
OUTPUTDIR=$(BASEDIR)/docs 
PACKAGE=tezz.util

html:
    javadoc "$(PACKAGE)" -d "$(OUTPUTDIR)" -encoding UTF-8

.PHONY: html

BASEDIR=$(CURDIR)
OUTPUTDIR=$(BASEDIR)/docs
SOURCEDIR=$(BASEDIR)/src/main/java
PACKAGE=tezz.util

html:
	javadoc "$(PACKAGE)" -d "$(OUTPUTDIR)" -sourcepath "$(SOURCEDIR)" -encoding UTF-8

.PHONY: html

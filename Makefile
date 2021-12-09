BASEDIR=$(CURDIR)
OUTPUTDIR=$(BASEDIR)/docs
SOURCEDIR=$(BASEDIR)/src/main/java
PACKAGE=tezz.util

html:
	javadoc "$(PACKAGE)" -d "$(OUTPUTDIR)" --source-path "$(SOURCEDIR)" -encoding UTF-8

.PHONY: html

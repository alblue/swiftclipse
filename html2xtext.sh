#!/bin/bash
#
# Given a valid XML file, print out an Xtext grammar file

XSLT=${XSLT:-"/usr/bin/xsltproc"}
XSL=${XSL:-"`dirname $0`/html2xtext.xsl"}

[ -x "${XSLT}" ] || exit 1

$XSLT $XSL $1

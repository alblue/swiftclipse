<?xml version="1.0"?>
<!-- Licensed under the Eclipse Public License, v1.0 -->
<!-- Copyright (c) 2015 Bandlem Ltd -->
<xsl:stylesheet xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="text"/>
  <xsl:template name="CamelCase">
    <xsl:param name="text"/>
    <xsl:choose>
      <xsl:when test="contains($text,'-')">
        <xsl:call-template name="CamelCaseWord">
          <xsl:with-param name="text" select="substring-before($text,'-')"/>
        </xsl:call-template>
        <xsl:call-template name="CamelCase">
          <xsl:with-param name="text" select="substring-after($text,'-')"/>
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:call-template name="CamelCaseWord">
          <xsl:with-param name="text" select="$text"/>
        </xsl:call-template>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
  <xsl:template name="CamelCaseWord">
    <xsl:param name="text"/>
    <xsl:value-of select="translate(substring($text,1,1),'abcdefghijklmnopqrstuvwxyz','ABCDEFGHIJKLMNOPQRSTUVWXYZ')"/>
    <xsl:value-of select="translate(substring($text,2,string-length($text)-1),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')"/>
  </xsl:template>
  <xsl:template match="/">
    <xsl:apply-templates/>
  </xsl:template>
  <xsl:template match="h2|h3">
/* <xsl:value-of select="text()"/> */
</xsl:template>
  <xsl:template match="*">
    <xsl:apply-templates/>
  </xsl:template>
  <xsl:template match="text()">
</xsl:template>
  <xsl:template match="span[@class='syntax-def-name']"><xsl:text>
</xsl:text><xsl:call-template name="CamelCase"><xsl:with-param name="text" select="normalize-space(text())"/></xsl:call-template>:
</xsl:template>
  <xsl:template match="*[@class='literal']">
    <xsl:text> '</xsl:text>
    <xsl:value-of select="text()"/>
    <xsl:text>'</xsl:text>
  </xsl:template>
  <xsl:template match="*[@class='alternative']">
    <xsl:apply-templates/>
    <xsl:if test="not(position()=last())">
      <xsl:text> | </xsl:text>
    </xsl:if>
  </xsl:template>
  <xsl:template match="sub">
    <xsl:text>?</xsl:text>
  </xsl:template>
  <xsl:template match="p[@class='syntax-def']"><xsl:apply-templates select="*[@class!='alternative']"/><xsl:apply-templates select="*[@class='alternative']"/>;
</xsl:template>
  <xsl:template match="*[@class='syntactic-cat']">
    <xsl:text> </xsl:text>
    <xsl:call-template name="CamelCase">
      <xsl:with-param name="text" select="normalize-space(a/text())"/>
    </xsl:call-template>
    <xsl:text> </xsl:text>
  </xsl:template>
</xsl:stylesheet>

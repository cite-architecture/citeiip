package edu.holycross.shot.citeiip

import edu.holycross.shot.cite._

import scala.util.Try

import scala.scalajs.js
import js.annotation.JSExport


import edu.holycross.shot.cite._




@JSExport case class IipSource (baseUrl: String, baseDirectory: String, directoryMap: Map[Cite2Urn,String]) {


  def collectionDirectory(urn: Cite2Urn): String = {
    val collectionUrn = urn.dropExtensions.dropProperty.dropSelector
    directoryMap(collectionUrn)
  }


  def iip(urn: Cite2Urn): String = {
    baseUrl + baseDirectory 
/*
http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/

VenA/

VA012RN_0013.tif

&RGN=0.204,0.2102,0.172,0.0218
&WID=9000
&CVT=JPEG
    */
  }

}

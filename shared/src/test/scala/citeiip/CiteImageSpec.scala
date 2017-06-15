package edu.holycross.shot.citeiip
import org.scalatest.FlatSpec
import edu.holycross.shot.cite._


/**
*/
class CiteImageSpec extends FlatSpec {

  val baseUrl = "http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&"
  val baseDirectory = "/project/homer/pyramidal/"


  val vaImgColl = Cite2Urn("urn:cite2:hmt:vaimg.2017a:")
  val vaDirectory = "VenA"
  val fileLayout = Map( vaImgColl -> vaDirectory)

  val iipSource = IipSource(baseUrl, baseDirectory, fileLayout)

  "An IIPSource" should "find IIP directories for image URNs" in {
    val urn = Cite2Urn("urn:cite2:hmt:vaimg.2017a:VA012RN_0013@0.204,0.2102,0.172,0.0218")

    val expected = "VenA"
    assert (iipSource.collectionDirectory(urn) == expected)
  }

}

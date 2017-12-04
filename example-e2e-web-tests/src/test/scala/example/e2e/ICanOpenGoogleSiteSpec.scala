package example.e2e

import org.scalatest.FlatSpec
import pawl.WebSpec

class ICanOpenGoogleSiteSpec extends FlatSpec with WebSpec {
  "Google" should "show main page" in {
    Guest open "http://google.com"
    Then see "Google"
    And see "" in "q" by name
  }
}

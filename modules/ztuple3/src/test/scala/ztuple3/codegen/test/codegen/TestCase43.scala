package ztuple3
package test
import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
object ZTuple3FetchText43 extends DefaultRunnableSpec {
    override def spec = suite("ztuple3 test 43")(
            test("ztuple3 with 43 should fetch the index 1") {
                assert(NumberDefined.number43(_1_th))(equalTo(NumberDefined.item1))
            }
             , 
            test("ztuple3 with 43 should fetch the index 2") {
                assert(NumberDefined.number43(_2_th))(equalTo(NumberDefined.item2))
            }
             , 
            test("ztuple3 with 43 should fetch the index 3") {
                assert(NumberDefined.number43(_1._0_th))(equalTo(NumberDefined.item3))
            }
             , 
            test("ztuple3 with 43 should fetch the index 4") {
                assert(NumberDefined.number43(_1._1_th))(equalTo(NumberDefined.item4))
            }
             , 
            test("ztuple3 with 43 should fetch the index 5") {
                assert(NumberDefined.number43(_1._2_th))(equalTo(NumberDefined.item5))
            }
             , 
            test("ztuple3 with 43 should fetch the index 6") {
                assert(NumberDefined.number43(_2._0_th))(equalTo(NumberDefined.item6))
            }
             , 
            test("ztuple3 with 43 should fetch the index 7") {
                assert(NumberDefined.number43(_2._1_th))(equalTo(NumberDefined.item7))
            }
             , 
            test("ztuple3 with 43 should fetch the index 8") {
                assert(NumberDefined.number43(_2._2_th))(equalTo(NumberDefined.item8))
            }
             , 
            test("ztuple3 with 43 should fetch the index 9") {
                assert(NumberDefined.number43(_1._0._0_th))(equalTo(NumberDefined.item9))
            }
             , 
            test("ztuple3 with 43 should fetch the index 10") {
                assert(NumberDefined.number43(_1._0._1_th))(equalTo(NumberDefined.item10))
            }
             , 
            test("ztuple3 with 43 should fetch the index 11") {
                assert(NumberDefined.number43(_1._0._2_th))(equalTo(NumberDefined.item11))
            }
             , 
            test("ztuple3 with 43 should fetch the index 12") {
                assert(NumberDefined.number43(_1._1._0_th))(equalTo(NumberDefined.item12))
            }
             , 
            test("ztuple3 with 43 should fetch the index 13") {
                assert(NumberDefined.number43(_1._1._1_th))(equalTo(NumberDefined.item13))
            }
             , 
            test("ztuple3 with 43 should fetch the index 14") {
                assert(NumberDefined.number43(_1._1._2_th))(equalTo(NumberDefined.item14))
            }
             , 
            test("ztuple3 with 43 should fetch the index 15") {
                assert(NumberDefined.number43(_1._2._0_th))(equalTo(NumberDefined.item15))
            }
             , 
            test("ztuple3 with 43 should fetch the index 16") {
                assert(NumberDefined.number43(_1._2._1_th))(equalTo(NumberDefined.item16))
            }
             , 
            test("ztuple3 with 43 should fetch the index 17") {
                assert(NumberDefined.number43(_1._2._2_th))(equalTo(NumberDefined.item17))
            }
             , 
            test("ztuple3 with 43 should fetch the index 18") {
                assert(NumberDefined.number43(_2._0._0_th))(equalTo(NumberDefined.item18))
            }
             , 
            test("ztuple3 with 43 should fetch the index 19") {
                assert(NumberDefined.number43(_2._0._1_th))(equalTo(NumberDefined.item19))
            }
             , 
            test("ztuple3 with 43 should fetch the index 20") {
                assert(NumberDefined.number43(_2._0._2_th))(equalTo(NumberDefined.item20))
            }
             , 
            test("ztuple3 with 43 should fetch the index 21") {
                assert(NumberDefined.number43(_2._1._0_th))(equalTo(NumberDefined.item21))
            }
             , 
            test("ztuple3 with 43 should fetch the index 22") {
                assert(NumberDefined.number43(_2._1._1_th))(equalTo(NumberDefined.item22))
            }
             , 
            test("ztuple3 with 43 should fetch the index 23") {
                assert(NumberDefined.number43(_2._1._2_th))(equalTo(NumberDefined.item23))
            }
             , 
            test("ztuple3 with 43 should fetch the index 24") {
                assert(NumberDefined.number43(_2._2._0_th))(equalTo(NumberDefined.item24))
            }
             , 
            test("ztuple3 with 43 should fetch the index 25") {
                assert(NumberDefined.number43(_2._2._1_th))(equalTo(NumberDefined.item25))
            }
             , 
            test("ztuple3 with 43 should fetch the index 26") {
                assert(NumberDefined.number43(_2._2._2_th))(equalTo(NumberDefined.item26))
            }
             , 
            test("ztuple3 with 43 should fetch the index 27") {
                assert(NumberDefined.number43(_1._0._0._0_th))(equalTo(NumberDefined.item27))
            }
             , 
            test("ztuple3 with 43 should fetch the index 28") {
                assert(NumberDefined.number43(_1._0._0._1_th))(equalTo(NumberDefined.item28))
            }
             , 
            test("ztuple3 with 43 should fetch the index 29") {
                assert(NumberDefined.number43(_1._0._0._2_th))(equalTo(NumberDefined.item29))
            }
             , 
            test("ztuple3 with 43 should fetch the index 30") {
                assert(NumberDefined.number43(_1._0._1._0_th))(equalTo(NumberDefined.item30))
            }
             , 
            test("ztuple3 with 43 should fetch the index 31") {
                assert(NumberDefined.number43(_1._0._1._1_th))(equalTo(NumberDefined.item31))
            }
             , 
            test("ztuple3 with 43 should fetch the index 32") {
                assert(NumberDefined.number43(_1._0._1._2_th))(equalTo(NumberDefined.item32))
            }
             , 
            test("ztuple3 with 43 should fetch the index 33") {
                assert(NumberDefined.number43(_1._0._2._0_th))(equalTo(NumberDefined.item33))
            }
             , 
            test("ztuple3 with 43 should fetch the index 34") {
                assert(NumberDefined.number43(_1._0._2._1_th))(equalTo(NumberDefined.item34))
            }
             , 
            test("ztuple3 with 43 should fetch the index 35") {
                assert(NumberDefined.number43(_1._0._2._2_th))(equalTo(NumberDefined.item35))
            }
             , 
            test("ztuple3 with 43 should fetch the index 36") {
                assert(NumberDefined.number43(_1._1._0._0_th))(equalTo(NumberDefined.item36))
            }
             , 
            test("ztuple3 with 43 should fetch the index 37") {
                assert(NumberDefined.number43(_1._1._0._1_th))(equalTo(NumberDefined.item37))
            }
             , 
            test("ztuple3 with 43 should fetch the index 38") {
                assert(NumberDefined.number43(_1._1._0._2_th))(equalTo(NumberDefined.item38))
            }
             , 
            test("ztuple3 with 43 should fetch the index 39") {
                assert(NumberDefined.number43(_1._1._1._0_th))(equalTo(NumberDefined.item39))
            }
             , 
            test("ztuple3 with 43 should fetch the index 40") {
                assert(NumberDefined.number43(_1._1._1._1_th))(equalTo(NumberDefined.item40))
            }
             , 
            test("ztuple3 with 43 should fetch the index 41") {
                assert(NumberDefined.number43(_1._1._1._2_th))(equalTo(NumberDefined.item41))
            }
             , 
            test("ztuple3 with 43 should fetch the index 42") {
                assert(NumberDefined.number43(_1._1._2._0_th))(equalTo(NumberDefined.item42))
            }
             , 
            test("ztuple3 with 43 should fetch the index 43") {
                assert(NumberDefined.number43(_1._1._2._1_th))(equalTo(NumberDefined.item43))
            }
    )
}

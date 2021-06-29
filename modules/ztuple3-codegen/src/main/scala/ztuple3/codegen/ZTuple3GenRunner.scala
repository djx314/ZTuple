package ztuple3
package codegen

import java.nio.file.Paths
import java.io.PrintWriter
import java.nio.file.Files
import scala.util.Using

object ZTuple3GenRunner {
  val testDir   = Paths.get(".", "modules", "ztuple3", "src", "test", "scala", "ztuple3", "codegen", "test", "codegen")
  val ztupleDir = Paths.get(".", "modules", "ztuple10", "src", "main", "scala", "ztuple")

  def main(arr: Array[String]): Unit = {
    {
      val filePath = testDir.resolve("ItemGen.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(ztuple3.codegen.txt.ItemGen().body)
        writer.println(content)
      }
    }

    for (i <- 1 to 256) {
      val filePath = testDir.resolve(s"TestCase${i}.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(ztuple3.codegen.txt.ZTuple3FetchTestX(current = i).body)
        writer.println(content)
      }
    }

    {
      val filePath = ztupleDir.resolve("ZTuple.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(ztupleN.codegen.scala2.txt.ZTupleGen(tupleCount = 10).body)
        writer.println(content)
      }
    }

    {
      val filePath = ztupleDir.resolve("TopTree.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(ztupleN.codegen.scala2.txt.TreeNumberGen(tupleCount = 10).body)
        writer.println(content)
      }
    }

    {
      val filePath = ztupleDir.resolve("SubMiddleTree.scala")
      Files.createDirectories(filePath.getParent)
      Using(new PrintWriter(filePath.toFile, "utf-8")) { writer =>
        val content = StringUtil.trimLines(ztupleN.codegen.scala2.txt.SubMiddleTreeGen(tupleCount = 10).body)
        writer.println(content)
      }
    }
  }
}

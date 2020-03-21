import chisel3._
import chisel3.util._
import chisel3.iotesters._

object ElaborateModule extends App {

  if (args.length < 1)
    println("no argument.")
  else {
    val genArgs  = Array("-td=rtl/" + args(0), "-tgvo=on", "-tn=" + args(0), "-tbn=verilator")
    val genArgs2 = Array("-td=rtl/" + args(0) + "/Elaborate", "-tn=" + args(0))
    for (p <- genArgs) {
      println(p)
    }
    args(0) match {
      /*
            case "chapter4.SampleBool"   =>{
                //chisel3.Driver.execute(genArgs, () => new chapter4.SampleBool)
                val result = iotesters.Driver.execute(genArgs, () => new chapter4.SampleBool){
                    c => new PeekPokeTester(c){
                        reset()
                        step(2)
                        //expect(Wire(true.B), true)
                    }
                }
                assert(result, "Test Fail.")
            }
            case "chapter4.SampleInt"   =>{
                val result = iotesters.Driver.execute(genArgs, () => new chapter4.SampleInt){
                    c => new PeekPokeTester(c){
                        reset()
                        step(2)
                        //expect(Wire(true.B), true)
                    }
                }
                assert(result, "Test Fail.")
            }
            case "chapter4.SampleVec"   =>{
                val result = iotesters.Driver.execute(genArgs, () => new chapter4.SampleVec){
                    c => new PeekPokeTester(c){
                        reset()
                        step(2)
                        //expect(Wire(true.B), true)
                    }
                }
                assert(result, "Test Fail.")
            }
            case "jupyter1.testReg"   =>{
                val result = iotesters.Driver.execute(genArgs, () => new jupyter1.testReg()){
                    c => new PeekPokeTester(c){
                        var state = c.init
                        for( i <- 0 until 10){
                            poke(c.io.in, i%2)
                            state = ((state*2) + (i%2))&0xf
                            step(1)
                            expect(c.io.out, state)
                        }
                    }
                }
                assert(result, "Test Fail.")
            }
            case "jupyter1.testFIR"  =>{
                val result = iotesters.Driver.execute(genArgs, () => new jupyter1.testFIR(0,0,0,0)){
                    c => new PeekPokeTester(c){
                        poke(c.io.in, 0)
                        expect(c.io.out, 0)
                        step(1)
                        poke(c.io.in, 4)
                        expect(c.io.out, 0)
                        step(1)
                        poke(c.io.in, 5)
                        expect(c.io.out, 0)
                        step(1)
                        poke(c.io.in, 2)
                        expect(c.io.out, 0)
                        step(1)
                    }
                }
                assert(result, "Test Fail.")
            }
       */
      case _ =>
        println("invalide argument.")

    }
  }

}

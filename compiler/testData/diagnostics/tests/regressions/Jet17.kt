// RUN_PIPELINE_TILL: BACKEND
// FIR_IDENTICAL
// JET-17 Do not infer property types by the initializer before the containing scope is ready

class WithC() {
  val a = 1
  val b = a
}

package ztuple
trait TopNumber {
    type Next[D <: SubTree, T] <: ZTuple
    def next[D <: SubTree, T](d: D, t: T): Next[D, T]
}
case class TopSimple10[I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8  , I9 ](i1: I1  , i2: I2  , i3: I3  , i4: I4  , i5: I5  , i6: I6  , i7: I7  , i8: I8  , i9: I9 ) {
    type Next[D <: SubTree, T] <: ZTuple
    def next[D <: SubTree, T](d: D, t: T): Next[D, T]
}
case class TopDeep9[N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree  , N6 <: SubTree  , N7 <: SubTree  , N8 <: SubTree  , N9 <: SubTree , Tail <: TopNumber](
     n1: N1,  n2: N2,  n3: N3,  n4: N4,  n5: N5,  n6: N6,  n7: N7,  n8: N8,  n9: N9,  tail: Tail
) {
    type Next[D <: SubTree, T] <: ZTuple
    def next[D <: SubTree, T](d: D, t: T): Next[D, T]
}
    case class TopZero1[N1 <: SubTree ](
        n1: N1 
    ) {
        type Next[D <: SubTree, T] <: ZTuple
        def next[D <: SubTree, T](d: D, t: T): Next[D, T]
    }
    case class TopZero2[N1 <: SubTree  , N2 <: SubTree ](
        n1: N1  , n2: N2 
    ) {
        type Next[D <: SubTree, T] <: ZTuple
        def next[D <: SubTree, T](d: D, t: T): Next[D, T]
    }
    case class TopZero3[N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree ](
        n1: N1  , n2: N2  , n3: N3 
    ) {
        type Next[D <: SubTree, T] <: ZTuple
        def next[D <: SubTree, T](d: D, t: T): Next[D, T]
    }
    case class TopZero4[N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree ](
        n1: N1  , n2: N2  , n3: N3  , n4: N4 
    ) {
        type Next[D <: SubTree, T] <: ZTuple
        def next[D <: SubTree, T](d: D, t: T): Next[D, T]
    }
    case class TopZero5[N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree ](
        n1: N1  , n2: N2  , n3: N3  , n4: N4  , n5: N5 
    ) {
        type Next[D <: SubTree, T] <: ZTuple
        def next[D <: SubTree, T](d: D, t: T): Next[D, T]
    }
    case class TopZero6[N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree  , N6 <: SubTree ](
        n1: N1  , n2: N2  , n3: N3  , n4: N4  , n5: N5  , n6: N6 
    ) {
        type Next[D <: SubTree, T] <: ZTuple
        def next[D <: SubTree, T](d: D, t: T): Next[D, T]
    }
    case class TopZero7[N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree  , N6 <: SubTree  , N7 <: SubTree ](
        n1: N1  , n2: N2  , n3: N3  , n4: N4  , n5: N5  , n6: N6  , n7: N7 
    ) {
        type Next[D <: SubTree, T] <: ZTuple
        def next[D <: SubTree, T](d: D, t: T): Next[D, T]
    }
    case class TopZero8[N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree  , N6 <: SubTree  , N7 <: SubTree  , N8 <: SubTree ](
        n1: N1  , n2: N2  , n3: N3  , n4: N4  , n5: N5  , n6: N6  , n7: N7  , n8: N8 
    ) {
        type Next[D <: SubTree, T] <: ZTuple
        def next[D <: SubTree, T](d: D, t: T): Next[D, T]
    }
    case class TopZero9[N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree  , N6 <: SubTree  , N7 <: SubTree  , N8 <: SubTree  , N9 <: SubTree ](
        n1: N1  , n2: N2  , n3: N3  , n4: N4  , n5: N5  , n6: N6  , n7: N7  , n8: N8  , n9: N9 
    ) {
        type Next[D <: SubTree, T] <: ZTuple
        def next[D <: SubTree, T](d: D, t: T): Next[D, T]
    }

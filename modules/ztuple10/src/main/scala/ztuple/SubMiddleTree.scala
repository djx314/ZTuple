package ztuple
trait SubTree {
    type Add[M <: MonadTop, T] <: ZTuple
    def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
}
    case class MiddleSubTree0[N0 <: SubTree ](
        n0: N0 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class MiddleSubTree1[N0 <: SubTree  , N1 <: SubTree ](
        n0: N0  , m1 : N1 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class MiddleSubTree2[N0 <: SubTree  , N1 <: SubTree  , N2 <: SubTree ](
        n0: N0  , m1 : N1  , m2 : N2 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class MiddleSubTree3[N0 <: SubTree  , N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree ](
        n0: N0  , m1 : N1  , m2 : N2  , m3 : N3 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class MiddleSubTree4[N0 <: SubTree  , N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree ](
        n0: N0  , m1 : N1  , m2 : N2  , m3 : N3  , m4 : N4 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class MiddleSubTree5[N0 <: SubTree  , N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree ](
        n0: N0  , m1 : N1  , m2 : N2  , m3 : N3  , m4 : N4  , m5 : N5 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class MiddleSubTree6[N0 <: SubTree  , N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree  , N6 <: SubTree ](
        n0: N0  , m1 : N1  , m2 : N2  , m3 : N3  , m4 : N4  , m5 : N5  , m6 : N6 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class MiddleSubTree7[N0 <: SubTree  , N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree  , N6 <: SubTree  , N7 <: SubTree ](
        n0: N0  , m1 : N1  , m2 : N2  , m3 : N3  , m4 : N4  , m5 : N5  , m6 : N6  , m7 : N7 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class MiddleSubTree8[N0 <: SubTree  , N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree  , N6 <: SubTree  , N7 <: SubTree  , N8 <: SubTree ](
        n0: N0  , m1 : N1  , m2 : N2  , m3 : N3  , m4 : N4  , m5 : N5  , m6 : N6  , m7 : N7  , m8 : N8 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class MiddleSubTree9[N0 <: SubTree  , N1 <: SubTree  , N2 <: SubTree  , N3 <: SubTree  , N4 <: SubTree  , N5 <: SubTree  , N6 <: SubTree  , N7 <: SubTree  , N8 <: SubTree  , N9 <: SubTree ](
        n0: N0  , m1 : N1  , m2 : N2  , m3 : N3  , m4 : N4  , m5 : N5  , m6 : N6  , m7 : N7  , m8 : N8  , m9 : N9 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree0[T0 ](
        t0: T0 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree1[T0  , T1 ](
        t0: T0  , t1 : T1 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree2[T0  , T1  , T2 ](
        t0: T0  , t1 : T1  , t2 : T2 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree3[T0  , T1  , T2  , T3 ](
        t0: T0  , t1 : T1  , t2 : T2  , t3 : T3 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree4[T0  , T1  , T2  , T3  , T4 ](
        t0: T0  , t1 : T1  , t2 : T2  , t3 : T3  , t4 : T4 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree5[T0  , T1  , T2  , T3  , T4  , T5 ](
        t0: T0  , t1 : T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree6[T0  , T1  , T2  , T3  , T4  , T5  , T6 ](
        t0: T0  , t1 : T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5  , t6 : T6 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree7[T0  , T1  , T2  , T3  , T4  , T5  , T6  , T7 ](
        t0: T0  , t1 : T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5  , t6 : T6  , t7 : T7 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree8[T0  , T1  , T2  , T3  , T4  , T5  , T6  , T7  , T8 ](
        t0: T0  , t1 : T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5  , t6 : T6  , t7 : T7  , t8 : T8 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }
    case class BottomSubTree9[T0  , T1  , T2  , T3  , T4  , T5  , T6  , T7  , T8  , T9 ](
        t0: T0  , t1 : T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5  , t6 : T6  , t7 : T7  , t8 : T8  , t9 : T9 
    ) extends SubTree {
        type Add[M <: MonadTop, T] <: ZTuple
        def add[M <: MonadTop, T](m: M, t: T): Add[M, T]
    }

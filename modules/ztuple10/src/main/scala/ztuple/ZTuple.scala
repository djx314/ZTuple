package ztuple
trait ZTuple {
    type Next[T] <: ZTuple
    def next[T](t: T): Next[T]
}
case object ZTuple0 extends ZTuple {
    override type Next[T] = ZTuple1[T]
    override def next[T](t: T): ZTuple1[T] = ZTuple1(t)
}
    case class ZTuple1[I1 ](i1: I1 ) extends ZTuple {
        override type Next[T] = ZTuple2[ I1,  T]
        override def next[T](t: T): ZTuple2[ I1,  T] = ZTuple2( i1,  t)
    }
    case class ZTuple2[I1  , I2 ](i1: I1  , i2: I2 ) extends ZTuple {
        override type Next[T] = ZTuple3[ I1,  I2,  T]
        override def next[T](t: T): ZTuple3[ I1,  I2,  T] = ZTuple3( i1,  i2,  t)
    }
    case class ZTuple3[I1  , I2  , I3 ](i1: I1  , i2: I2  , i3: I3 ) extends ZTuple {
        override type Next[T] = ZTuple4[ I1,  I2,  I3,  T]
        override def next[T](t: T): ZTuple4[ I1,  I2,  I3,  T] = ZTuple4( i1,  i2,  i3,  t)
    }
    case class ZTuple4[I1  , I2  , I3  , I4 ](i1: I1  , i2: I2  , i3: I3  , i4: I4 ) extends ZTuple {
        override type Next[T] = ZTuple5[ I1,  I2,  I3,  I4,  T]
        override def next[T](t: T): ZTuple5[ I1,  I2,  I3,  I4,  T] = ZTuple5( i1,  i2,  i3,  i4,  t)
    }
    case class ZTuple5[I1  , I2  , I3  , I4  , I5 ](i1: I1  , i2: I2  , i3: I3  , i4: I4  , i5: I5 ) extends ZTuple {
        override type Next[T] = ZTuple6[ I1,  I2,  I3,  I4,  I5,  T]
        override def next[T](t: T): ZTuple6[ I1,  I2,  I3,  I4,  I5,  T] = ZTuple6( i1,  i2,  i3,  i4,  i5,  t)
    }
    case class ZTuple6[I1  , I2  , I3  , I4  , I5  , I6 ](i1: I1  , i2: I2  , i3: I3  , i4: I4  , i5: I5  , i6: I6 ) extends ZTuple {
        override type Next[T] = ZTuple7[ I1,  I2,  I3,  I4,  I5,  I6,  T]
        override def next[T](t: T): ZTuple7[ I1,  I2,  I3,  I4,  I5,  I6,  T] = ZTuple7( i1,  i2,  i3,  i4,  i5,  i6,  t)
    }
    case class ZTuple7[I1  , I2  , I3  , I4  , I5  , I6  , I7 ](i1: I1  , i2: I2  , i3: I3  , i4: I4  , i5: I5  , i6: I6  , i7: I7 ) extends ZTuple {
        override type Next[T] = ZTuple8[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  T]
        override def next[T](t: T): ZTuple8[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  T] = ZTuple8( i1,  i2,  i3,  i4,  i5,  i6,  i7,  t)
    }
    case class ZTuple8[I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8 ](i1: I1  , i2: I2  , i3: I3  , i4: I4  , i5: I5  , i6: I6  , i7: I7  , i8: I8 ) extends ZTuple {
        override type Next[T] = ZTuple9[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  T]
        override def next[T](t: T): ZTuple9[ I1,  I2,  I3,  I4,  I5,  I6,  I7,  I8,  T] = ZTuple9( i1,  i2,  i3,  i4,  i5,  i6,  i7,  i8,  t)
    }

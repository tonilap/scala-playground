package com.toni.scala.datastructures

case class Tree[+T](value: T, left: Option[Tree[T]], 
    right: Option[Tree[T]])

object BinaryTree {

}
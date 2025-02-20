def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Or handle nulls differently, like throwing an exception
  }
  return a + b
}

println myMethod(null, 5)
println myMethod(5, null)
println myMethod(5, 10)
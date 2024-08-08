def array = [1, 3, 4, 5, 1, 5, 4]
def map = [:]

array.each{
  if (map[it]){
    map[it] = ++map[it]
  } else {
    map[it] = 1
  }
}

println map
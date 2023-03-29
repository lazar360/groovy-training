//Classic For Loop example:

def cars = ["BMW", "Mercedes Benz", "Volvo", "Chevrolet", "Ford"]

for (int i = 0; i < cars.size(); i++) {
    println cars[i]
}

//For loop with comma-separated

for (int i = 1, j = 10; i < j; i++, j--) {
    println(i + ', ' + j)
}

// For In Loop Examples
@groovy.transform.Canonical
class Cars {
    String brand = ""
    String type = ""
    Integer price = 0 
}

List<Cars> cars = [
    [brand: "BMW", type: "750i", price: 300000],
    [brand: "Mercedes Benz", type: "B600", price: 120000],
    [brand: "Volvo", type: "S230", price: 98000]
]

for (car in cars) {
    println "$car.brand $car.type -> $car.price"
}

//Iterate over an array of string examples:

def carNameArray = ["BMW", "Mercedez Benz", "Volvo"]

for (car in carNameArray) {
    println car
}
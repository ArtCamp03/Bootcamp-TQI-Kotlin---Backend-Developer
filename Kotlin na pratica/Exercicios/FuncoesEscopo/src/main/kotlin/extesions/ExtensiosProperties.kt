package extesions

class ExtensiosProperties {
}

data class Item(val nome: String, val price: Float)

data class Order(val itens: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.itens.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.itens.maxByOrNull { it.price }?.nome ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
    get() = itens.map { it.nome }.joinToString()

fun main() {
   // val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water")))
/*
    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Itens: ${order.commaDelimitedItemNames}")


 */
}
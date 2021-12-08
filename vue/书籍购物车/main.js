const app = new Vue({
  el: "#app",
  data: {
    books: [
      {
        id: 1,
        name: "《算法导论》",
        date: "2006-9",
        price: 85.00,
        count: 1
      },
      {
        id: 2,
        name: "《UNIX编程艺术》",
        date: '2006-2',
        price: 59.00,
        count: 1
      }, {
        id: 3,
        name: "《编程珠玑》",
        date: "2008-10",
        price: 39.00,
        count: 1
      },
      {
        id: 4,
        name: "《代码大全》",
        date: '2006-3',
        price: 128.00,
        count: 1
      },
    ],

  },
  methods: {
    // getFinalPrice(price) {
    //   return '￥' + price.toFixed(2)
    // }
    add(index) {
      console.log(index);
      this.books[index].count++;
    },
    sub(index) {
      if (this.books[index].count == 1) {
        return true
      } else {
        this.books[index].count--;
        return false
      }
    },
    removeHandle(index) {
      console.log(123);
      this.books.splice(index, 1)

    },
    // totalPrice() {
    //   let totalPrice = 0

    //   for (let x of this.books) {
    //     totalPrice += x.price * x.count
    //   }
    //   return totalPrice;
    // }

  },
  computed: {
    totalPrice() {
      // let totalPrice = 0

      // for (let x of this.books) {
      //   totalPrice += x.price
      // }
      // return totalPrice;
      return this.books.reduce(function (preValue, book) {
        return preValue + book.price * book.count
      }, 0)
    },


  },

  filters: {
    showPrice(price) {
      return '￥' + price.toFixed(2)
    },
  },

})
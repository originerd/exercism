class Gigasecond {
  constructor(from) {
    this.from = from;
  } 

  date() {
    return new Date(this.from.getTime() + 1000000000000);
  }
}

export default Gigasecond;

class Pangram {
  constructor(sentence) {
    this.sentence = sentence;
  }

  isPangram() {
    const characters = new Set(
      this.sentence.toLowerCase().replace(/[^a-z]/g, '').split(''),
    );

    return characters.size === 26;
  }
}

export default Pangram;

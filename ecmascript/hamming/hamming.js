class Hamming {
  compute(dna, comparative) {
    if (dna.length !== comparative.length) {
      throw new Error('DNA strands must be of equal length.');
    }

    return dna.split('').reduce((acc, e, i) => acc + (e === comparative[i] ? 0 : 1), 0);
  }
}

export default Hamming;

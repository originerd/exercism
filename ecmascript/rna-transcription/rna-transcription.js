const RNA = {
  A: 'U',
  C: 'G',
  G: 'C',
  T: 'A',
};

class Transcriptor {
  toRna(dna) {
    if (dna.replace(/[ACGT]/g, '')) {
      throw new Error('Invalid input DNA.');
    }

    return dna.split('').map(e => RNA[e]).join('');
  }
}

export default Transcriptor;

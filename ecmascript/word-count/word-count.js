class Words {
  count(sentence) {
    return sentence.trim().toLowerCase().split(/\s+/).reduce(
      (acc, e) => {
        acc[e] = (Number.isInteger(acc[e]) && acc[e] + 1) || 1;

        return acc;
      },
      {},
    );
  }
}

export default Words;

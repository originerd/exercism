class Bob {
  hey(message) {
    const text = message.trim();

    if (text === text.toUpperCase() && text !== text.toLowerCase()) {
      return 'Whoa, chill out!';
    } else if (text.endsWith('?')) {
      return 'Sure.';
    } else if (text === '') {
      return 'Fine. Be that way!';
    }

    return 'Whatever.';
  }
}

export default Bob;


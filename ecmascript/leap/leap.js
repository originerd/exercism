const criteria = [400, 100, 4];

const isLeapYear = (year) => {
  for (let criterion of criteria) {
    if (year % criterion !== 0) {
      continue;
    }

    return (criterion !== 100) ? true : false;
  }

  return false;
}

export default isLeapYear;

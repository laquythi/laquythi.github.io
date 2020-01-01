import React from "react";
import Data from "./Components/Data";

class App extends React.Component {
  render() {
    var informations = [
      {
        id: 1,
        province: "Thái Bình",
        district: "Đông Hưng",
        population: "1458023"
      },
      {
        id: 2,
        province: "Thái Bình",
        district: "Hưng Hà",
        population: "1094722"
      },
      {
        id: 3,
        province: "Nam Định",
        district: "Hải Hậu",
        population: "1285023"
      },
      {
        id: 4,
        province: "Quảng Ninh",
        district: "Vân Đồn",
        population: "937391"
      },
      {
        id: 5,
        province: "Hà Nam",
        district: "Lý Nhân",
        population: "2048371"
      },
      {
        id: 6,
        province: "Hải Dương",
        district: "Nam Sách",
        population: "1048282"
      }
    ];
    let elements = informations.map((anything, index) => {
      let result = (
        <Data
          key={anything.id}
          province={anything.province}
          district={anything.district}
          population={anything.population}
        />
      );
      return result;
    });
    return <div className="container">{elements}</div>;
  }
}

export default App;

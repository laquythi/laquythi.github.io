import React, { Component } from "react";
import "./App.css";
import Product from "./components/Product";

class App extends Component {
  onClick (){
    console.log('day la app component');
  }

  onClick2 (text){
    console.log(text);
  }
  render() {
    var products = [
      {
        id: 1,
        name: "Iphone X 128 GB",
        price: 13000000,
        image:
          "data:image/jpeg;base64,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",
        status: true
      },
      {
        id: 2,
        name: "Iphone 8 16 GB",
        price: 10500000,
        image:
          "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxEQEBAQEBAQDxAQEBAQDxUQEA8PDxAQFREXFxgSFRUYHSggGBolGxUWITEhJSkrLy4uFx8zODMtNygtLisBCgoKDg0OGxAQGjAlHSYrLS0rLS0uLi0tLS0tKy0tLSsrKy03LS0tLS4wLS0tLS0rLS0tLystLS0tLS0tLS0tLf/AABEIAOEA4QMBIgACEQEDEQH/xAAcAAABBAMBAAAAAAAAAAAAAAAABAUGBwECAwj/xABOEAABAwICAwkIDwYGAwEAAAABAAIDBBEFEgYhMQcTNUFRYXFzsyIzgZGSsbLRFBUWIyQyNEJTcoOTobTDUmJjwdLwJUN0gsLhoqPxVP/EABsBAQACAwEBAAAAAAAAAAAAAAADBQECBAYH/8QAMhEAAgICAAQCCQIHAQAAAAAAAAECAwQRBRIhMUFREzIzYXGBkbHwUtEUFSJCocHhNP/aAAwDAQACEQMRAD8AvFCEIAVaacafSMfJT0TmsERLJ5yA8iQajHCDquDqLiDrBAFwSJtpViDqaiqZmW3xkL96vs30jKy/+4hef8XGXeYW3IDGu1kkuc/YSTtNra+c8qyDWrxOonJMs8klzf3175fweSB4AFxbDfbk+7i/pTHX4k5kro4WhxjOVzi0vJcDY5W7AL6uO6ccFxPf8zXNa2Vjc3cizXsvY6uIi48aAcG0beRv3cX9K3FC3kb93F/SurCnOfCJ44mzPjc2N1rHVx7CRxJsDR7BbyN+7i/pR7BbyN+7i/pSpCAS+wW8jfu4v6UewWcjfu4v6UqXOa1rHYTZ31Rrd+AKAZsTqoYG5nNa6/xGhkbS7nLsvcjo19Cj7tJZPmRU8Y5og4+N11rpZKTVPaf8sBp5MxF3Hxm3QAmZYA8+6ao/g/cRepHumqP4P3EXqTMhDI8+6ao/g/cRepHumqP4P3EXqTS+Mi17axcWIPjtsWWwki484QwOvumqP4P3EXqR7pqj+D9xF6k1+x3cg8YWHxEC584QDr7pqj+D9xF6ke6ao/g/cRepMyEMjz7pqj+D9xF6kvw/TqshIyuDQD/lukgPjY4eZRdCA9G7nm6d7ILIqp2YPIa2Uhoex5Ng2SwAc0kgZgBYkXFjmVqrx9obN76+M62ujc+31RrHhbcL1PodXOnoaeR5zPyGORx2ufE4xuceclhPhQwPSEIQAhCEAIQhARbdNJ9q6jLqJdTAdJqolSeNG0wI+bHCR4GBXdulcGT9ZSfm4lSWNd++zi7MLIItiuGyiV8sHdslcX2DgHscXZi0g8Wbj5gl+jmHuj3yWQjfHtMbWhwcQCQXOcRqvqGpLxGDtAKURCyA6xxi5dbWQATxkBSKu0lmmgEDgALNDnAuu7Ls1XsNg8XEmBq3BWNDZshYQsgyuFWDYW/fv0b0+67LSYavA/snoCAaVfLanrSmpTMaOOr66tawvzMlbYMZnLs1/wClZxHc8nh30GSMOhiErw97GGxuLA3te4te9tmvWt1VJx5vAj9NBS5fEhaFs4WNtawFGSmCUJTBTh3zrfinCHBWu/zCP9o9akjVKXYzysZkJ9dgAH+YfJHrWPaEfSHyR61J/C2+Rq2l3GNCfPaEfSHyR61kYAPpD5I9afwtvkNoYkKYN0FkIBEgsbW+Lrvs13truPGnHB9ymsq4zLDZzA98ZzOjYc7TYizjfatHTNd/ujOiM6HfK2c7JQfu3L01uXZva2PMbkTVPbvP8152wvCzS4i2Fxu5gna/Zqc1jwQLbdi9F7mPBzOuqO2ctJRcXpmCVoQhagEIQgBCEICMbpXBk/WUn5uJUljffvs4uzCu3dK4Mn6yk/NxKksb799nF2YWQJmLsxcGrq0oBQ0roCuLStwUBvdF1rdF0BtdayO1W5c58UT/AFoukArM05jGxkUpPO7IfMgFejQ+G4nY2O+RbNR+enHE6HODe5uNd9aZMFqMlfiHIZY/+amAs4XV1hpOlfP7nmeIWSrym/B6+yKox/CiwlwCYVa+O4cHNOpVridIY3nVqXDl0cj5l2LfByfSR5WJ4n2KeKKpTElFPLYrnrnplnFksjfmCwm6kqdicM19as6rNo0sjvqbBZC0BW11OQrodWynZc26SiWc7ASB0lcwstCxym8rGo6OWH/L4Oqm9B69DbmPBzOuqO2cvPdH8vg6qX0Hr0JuY8HM66o7ZyqMj2khHsStCEKA2BCEIAQhCAh+6q0HDjcXtU0hHTv7dapvG+/fZxdmFcm6qf8ADj/qaXt2qnMc799lD2YWQI2rq1cmroEB2aVuCuIK3BQG90twjD3VMojacuouc4i+Vo47ce0Dwpx0YwlkoMsozNDsrG3IBIGtx5duzpT87C6Zt35d7GU58kj42Fg1nMAbEakBAdI5mU7pGxOLwDkjcbXJA1nVxA3/AATRo8L78TrNtvHrilv5gm/HMXFVVyPha2OnZ3ETQ212jY7pOspw0ed30cZAt4IpfWEBqyoDK6uBIGaVtvBf1qVYPXg9ySoViWFOqKmvdGffIpWlo2ZgQ646dQTTRYzNC4XucpsQdR1cS7cfK9GlFrocGfwydsVZ+rt8uhcE8WYKE6TYTcE2Ul0bxllVGCDrGojjBSnE6QOadSs5KNsCgonPHs5JdGiuIHCjoo52RxPqKipqIs80cc4gjgbC7KxjwWh7jNcuIJADbWub5roRU0UVc9kcDm1nsOd0MTY2Sh0W+Nl3tlmh7QHg5QAQWcdyX0UFQ1kgphDUF0oMlJPHFIHgMOWeMPOt4u5pyWcARtBNmzSStc2lipKh0TZXVAmkiphFko4I2uayMMZZm+EyzOIvfU3MbnVRWw5JNHqqrFOKkhqwujM1SYIJA6MOkO+vaY2NgZcuqJBfuWhgzEXJ4tZUoxKop3QUToY97h3yrizBrBUTRxmACSR1tchzPdY6m5rDUFG6HFaWGOqp95nmZNKLTMmjpZnUzHXbE5pjkABcGvIB2tbtsnTEa2lOH0Qijma/fqzLnqopcl3QZi9rYWl1wNXxbWO3Ytq7Gmifex0rpon0kT44I4Q2rniFrvlcwQwuG+SHW83e48QF9QCagVu2oHsCMXGb2dUEi4vb2NTi9uS4PiXCN4Ksq5rRE49TsdiyHLRz7rVpUyZpMzQH4fB1UvoPV+bk7QKKXnq5Sec5WDzAKgsP+XwdVN6Dlfu5OfgUvNVzA83ctVRke0ZvHsTVCEKA2BCEIAQhCAi+6W0HDJ7i9pKQjmPsuLWqUx3v32UPZhXZuk8GT9ZSfm4lSePd++yh7MLIEQW4K5hbAoDqCtgVzBWboCXaK1XvLmcbHk+Bw1HxgqP7p+ke9xCkjPdzC8tvmxfs/wC4/gDypPTYkaYmUawBZw/aHIoXiEb6iWSaV93yOLjYahyAcwFh4FgCHD5srsv7VtnEVJ8AjJe93E2N7T0ujeR6JTFS0gYbk3PFzKR6O7JuhvZTIBdgzb1mJHklj/5pFpTgG+gzRD3wfHaPnjl6U+6JQZ6vFhySQW/9iX1ERabLTm5X17HquH1V5OEqp+/7sq7AMWdSTB4vlvaQc3RyhXfBS781royHtcyN4JszU8XGq56FV+lWj97zwjXtkaOP94c600H0ofBIIZJH7249xdzrMdbLy8YsFYYt8ovk30fY8XxvhLrk3JdV5eKJvjWjD5Wu+J8UuFze4Dmhx1cQzi586rqu0XkiqWQylsIfvpvdrgBGzMTtA4i25IFw65ABItuV7nNuHvsbbHO4tniUK0lpZe5LZJG73rZlcWlp7o3BHHdzjf8AePKV1ZNEpx2VeBlxi+UjkuhNU0kExAZnNGZ+VxsCRdusi7Wl3Rz6lkaGVQdYmAa8oJlAzai4W1X1sbn18XPqTQ+vqGh0O/S5XE5m74+zrlxN9ewlziRx31rlJXzk91NKbE2vI82Jvfj/AHneM8qqeqL5PyJM3RSqB7nenD3pt98a2z3tDshvxgOuebZc6lpQ0gfEJN/YBaf5khDXRBhs5xAADt8YAeVzRYk6o77ZT8c0vxWt75J8Vpu1u3YCSQOK6W4RUPAIZJIwG4cGPe0OBABBAOsGw8SnqnJvRlvoODHEpVG1coWJU0K0gvM55M40Py+DqpfQevQm5gB7Xt1bZ6gnnO+kXPgA8S8+UPy+DqpvQevQm5jwe3rqjtnKqyPaSJYdiWIQhQGwIQhACEIQEY3SeDJ+spPzcSpLH+/DqoezCu3dK4Mn6yk/NxKkdIT799lD2YWQIQVsCuN1sCgOwKzdccy41lTkbq2nUPWgEmKVOZ2QbG7edyQLKwsAE66Py2dIz9pjndGWN4/5/gmpOWA99PVS+gUBNNz6LNWYxyiSnt/7U+YtR31gdPSmrc0Hw3Gespv1VMa6AG54jt9a1lHZecOucIogb221FQzSnR/LeeEatr2ji/eCsPEqXK4pucOI7FpXPT5ZF/kY9eXVqXyfkNegWke+t9jynu2juSfnN9akmIUod/fMq8x7CHU0gqae4AdmcB808o5lONHsYbVwBw+O0WcOdXuJfzLkl3PlPGeGzwr+bXT8/wAMgWP4dvcrHW1F4HjUeqxaR45HOHiKsjTOivA5wGtrmu/FV9irPfXG2p2V/lNB891y5lfK+h14F3pIoRJywY90Qm1OOEzAOAK5qPXR3vsSJjV2AWsa3V2jmYnovl8HVTeg9ehNzHg9nXVHbOXnuiPw+DqpfQcvQu5jwezrqjtXKmyfaSOiHqkrQhCgNgQhCAEIQgIxuk8GT9ZSfm4lR+kR9/8AsoezCvDdJ4Mn6yk/NxKjNJT7/wDZQ9mFkDfdF1yzIzIDrmTXUzZnX4tg6F3q5tWUce3oSNYBhCEIATlgPfT1UvoFNqccB767qpfQKAn+5gPhmM9ZTfrKdPG0FQfct+W4z1lN+spzUDjQscV/0jDi9JqPNrHOFGZo7KezMD284/uyiWJU2Vx5DrHQobY+J6HBv/tY0OaCCCLgqKzwvw6ff4gTC4++NHzRyhS17VyniD2lrhcHlUmPc96fdEvEeH15tThNfAUyuZV0riwhwew28IuPxUBno87QbfNsfP6/Enmgldh82XWaWU26pxOo/VulEELd+ljHxS7Oz6r9Y/HMPArvmjck33Pl1mJdgWyql4dUQp1FZr+aybAVOcVoMm+C21hI6QoMq/Jr9G0iwxbXYm2SbCKlzoxfWRqvypybcpp0d1sI5HJ/pYszgOdWVDbrTZmxpMSU8eWvpueGY/8Ai9egdzHg9nXVHauVH4jGG4hRgf8A5pvM9XfuY8Hs66o7Zyq8j2jJanuCZLEIQoCQEIQgBCEICMbpPBk/WUn5uJURpOfhH2UPZhXvuk8GT9ZS/m4lQulJ+EfZQ9mEA2XWHPsLrTMuEz76uIIDRxubrCEIDCEIQAnLAe+u6qX0Cm1OWA99PVS+gUBP9y75bjPWU36ynk6gO5gfhuM9ZTfrKezFZLHG9VCPfMpvxcaQ4zTZtY4wXN6eNv8ANK5lyzXaW8Y1t6QtWWdbcWpIickWu3KuUkJCc8Qis4kar6+g8YSltOJIw7lFjzOGpQRWpFx6fST8CMVVO2Rpa4A3Ftajrc1NNGSSWA5AT+yTqBPMfOpjV0xaU3YrQCRh1bQrLHscTg4rgV5tW163h+x0xymDo45BsJynoc0qpZGZXFvISPEVbGDymSnkp3/His5vO0G9/wCSrXH4N7qJByuuPCujNSlBTR4HChKqydU+6FmjDtcg+qfOpjgjLv6BdQnRp3vjhyt8xU8wE2bK/wDZapcR7qRLlPW2J8X4Ro/9NN5pFde5jwe3rqjtnKlMX4Qof9JKT4RIrr3MeD2ddUds5V+R7RkuM91JksQhCgJwQhCAEIQgIxuk8GT9ZSfm4lQWlR+EfZQ9mFfu6TwZP1lL+biVAaVn4T9lD2YQDQ9y4rJKwgBCEIDCEIQAnLAe+nqpfQKbU44D309VL6BQE73ND8NxjrKf9VTyRygG5wfhuMdZT/qqcvcha4q3WjjMUkkPGlMhSOYrDLKtCGt160s0aIdvkB4xnb07D/JJJkmp5zFIyRu1rgekcYULens7XDnqcV38B0r6PMNmtpsf76U0z0tm7NillWWl7ZG/EmaHdBO38UhxOn7nwLqrZxRyWopMgxG9Sh41DW13O13/AHZQ3TiEb6Hjj/mFPMQhuCOW4UI0qYXMF9osfwXcnzUyj5FRxihLJhfH+9dfihlwB1ph9V3rU00enz0rOJ1VVb036rdZPgCruOQtNwbGxHgIsn/CJpZGwxt7lsLJWgjbmlcczhz5SGqPFta/pX52KXKhzR/PD/pJMQn3zEqZwtk3mYM52hrxfw+ZXjuY8Ht66o7ZyoRsZbX0t9m8TW8DXj/rwK+9zHg9nXVHbOUF7TslrzJMdJVJIliEIUJMCEIQAhCEBGN0ngyfrKX83EvP2lp+E/ZQ9mF6B3SeDJ+spfzcS8+aWfKT1UPZhAMyEIQAhCwgBCEIATlgPfT1UvoFNqccB767qpfQKAmu56fhuL9ZT/qqbvcoLoCfhuL9ZB+qpm9yF1hx3UvzxMPck0pW8jkmkctGyyhE4SlI5komKSSlRSO6tEgwSbfYjEdrNbPUl0gzx34x3LukJg0bmy1DRxFS1tOBO+P5srM7frDb51LXLsypzoqE2vn+5BcUjykjwhRTSai7mN1tT2uHhDj/ACIVg6VURY0OtsdY9BTfNhoqsMfl1y08pc3l2B1ugtPjBXfXNJvfZo4s18+JXP8ATPX1RSMlOc+QC5JsFOtH8O1sYBrO3zk+dJMPwWSSQyNYbXLQTqHPZTGGmFFAZHa5njKwHV/8HGegLSVscWDl3k+iR57IrlkWqmvxIzXzA4rCxvxYYJI+l2R5PnV6bmPB7OuqO2cvP1MP8Qg13vFMb8pyvufCV6B3MeD2ddUds5clcXGKT7nbZUqpci8OhLEIQtjQEIQgBCEICMbpPBk/WUv5uJefNLPlJ6qHswvQe6TwZP1lL+biXnzSz5Seqh7MIBmQhCAFhZWEBoZB/fTZZEgNtY18428ixvQuTt/lrJ/msbyOU7LcWzV6kBtnHKOTaE6YD313VS+gU0GAcp2AcWzX607YD313VS+gUBLtBj8NxbrIP1VMXvUL0KNq3Fesg/UUse9aNnoeHx3Svn9we9J5Hoe9JnvWjZaQgYkeksrlvI9J3uUMmdcIjpo828zDyOsfD/ZU1rHZXwS/syZT0OBbb8R4lBdHKkMnAOx2rwjZ/NT2Rm+U8jR8YNzM+s3WPxC6KGnDZScU2r477fuKMXw5tRC9v7TTY8+0HzFVrhONNoZ3iXNvckeV+Vue0jCbG3HtI8KmVZpFvFP3Ni+Ro3sH5pGpxPMP5Kv5wHkud3RJuelddcVpqXY5cfFtupnV4bTXxQ6T6ZxnVT0WvidLaMDnytJv4wo/iNRJO8ukNyfAAOQDiC7FvILLUhbKmperEscPhSx9t9W/EYclsQpupm9F6vvcx4PZ11R2zlRM4/xGm6ib0Xq9tzHg9nXVHbOUM/WZ5/PWsma95LEIQtDjBCEIAQhCAjG6TwZP1lL+biXnzSz5T9lD2YXoPdJ4Mn6yl/NxLz5pZ8p+yh7MIBmQhCAFhZWEAIQhACccB767qpfQKbk44D313VS+gUBKNDz8NxXrIf1FKHuUT0UdatxTrIf1FI5HqGb6nqOGR3jx+f3YPek8j0SPXB7lFKRbwgYe5cXuWXuXNc05+COhLRljiCCNoNwptRaQsEOcnugLEc6hrIjZakWXVTGdUdvszmycavI0peAoraoyOLjqub9GvYk90LFl0KxvuTwhGC5YroZWC1CLqWNhtoYqwf4jTdRN6L1eu5jwezrqjtnKi63hGl6ib0Xq89zHg9nXVHbOWG9vZ4bif/qn8f8ARLEIQtThBCEIAQhCAjG6TwZP1lL+biXnzSz5T9lD2YXoLdMNsLqCBch1MQOW1VFqXn3Sz5T9lD2YQDMhCEBhCEIAQhCAE44F313VS+gU3JfgzrSHVf3uQeDKdaAX0mPRUdbiG+5/fJWZcjQ74ua99Y/aCXO05peSbyG/1KFaVfLanrXJqWrgmd9HEbqYKEdaXuLFdprS8k3kN9a5u0ypuSXyB61XyFo6Ys6FxrJXl9CfHS+m5JfIHrW8GmNI1wJbK4A6wWCx/wDJV8gLEaIRew+NZT8voWg3T6ibGGCKTOHlxdl1uaQO4PdWtq/FIJNMqUkkNlHNkb61BIpgAQWMcDbbcOHQQdS0kZaxF8pvYkcY2i/Ha48alkubuaQ4vkR3rRPfdjTckvkD1o92FLyS+QPWq/QteREn87yvd9CwPdhS8kvkD1rHuwpuSXyB61AELKjofzvK930JrT4pHU18Do81mxTNOYAG+R55edegdzHg9nXVHbOXmTQ75ZH9SXsnL0zuWknDYyRYmap1fbOC2Ky62Vs3OXdkuQhCEQIQhACEIQDLpnROnw+rjYM0hhc+Nv7Ukfdtb4XNAXnLSoBzoZmm7JIWNBGwlmr8Wlp8K9Tqn90HQKRm+yU0bpqaRxlMcYzy0shuSWMGt8ZN9TbkXtYttlApxBSl9BKCQG57GxykEg842g8xWpoZvoZPIcgE6Eo9hS/RSeQ5HsGb6KTyHIBOhKPYM30UnkOWPYUv0UnkOQHBLMIeBMy5sHZmE8gc0tv+K5+wpvopPIcj2FN9FJ5DkAg0qYfZUjiLb5Z/QbWcPA4EJoUvrqF1SwZ2ujmaNTnscGP1bSbdydXQbBMUmBVI/wApzhysLXg+EFANqEu9p6n6CXyCj2nqfoJfIKGRClsdOH07nN75FIXSDjMLgAHW5A4WP1ws+09T9BL5BW8OGVTHBzYZmuGwhpQwNyXVTcsELD8YukmtxhjwwN8eQnost5MLqXG/sd4PNGQPENS1fhNUTcwzEnaS1xJQCBCXe09T9BL5BR7T1P0EvkFDIhQl3tPU/QS+QV0iwGpcQDHkubXkLWD8SgFmh0d53O4hG5t+QvGUHxXPgK9TaC0piw+mBBBe10xB1Eb890gBHEQHgeBVbua7mkhLZKljmQAhzg9pY+f9xrTrDDxuIFxqA1kq8AhgEIQgBCEIAQhCAFgoQgKs3YeLoCp56ELIOBQsIWQKKDvsf12+dThCEBEtI+/u+q3zJsQhAZau9FtKEIBWsoQgMJTh3fW+HzIQgHxMVX8d/wBYoQsA4oQhZAFWVuSd8QhGC3kIQtQCEIQAhCEB/9k=",
        status: true
      },
      {
        id: 3,
        name: "Iphone 5S 128 GB",
        price: 8500000,
        image:
          "data:image/jpeg;base64,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",
        status: true
      },
      {
        id: 4,
        name: "Iphone 7 Plus 64GB",
        price: 12400000,
        image:
          "data:image/jpeg;base64,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",
        status: true
      }
    ];

    let elements = products.map((product, index) => {
      let result = "";
      if (product.status) {
        result = (
          <Product key={product.id} price={product.price} image={product.image}>
            {product.name}
          </Product>
        );
      }
      return result;
    });

    return (
      <div>
        <nav class="navbar navbar-expand-sm bg-light justify-content-center">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link" href="#">
                Props
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">
                Link 2
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">
                Link 3
              </a>
            </li>
          </ul>
        </nav>
        <div className="container">
          <div className="row">
            <div className="col-xs-12 col-sm-12 col-md-12 col-lg-12">
              {elements}
            </div>
            <div className="col-xs-12 col-sm-12 col-md-12 col-lg-12">
              <button type="button" className="btn btn-warning" onClick = {this.onClick}>
                Click Me
              </button>
              <button type="button" className="btn btn-warning" onClick = { () => {this.onClick2('ABC')} }>
                Click Me 2
              </button>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default App;
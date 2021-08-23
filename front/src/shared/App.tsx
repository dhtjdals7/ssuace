import { Switch, Route } from 'react-router-dom';
import Home  from '../pages/home';
import Detail from '../pages/detail';

function App() {
  return (
    <div>
      <header>This is header</header>
      <Switch>
        <Route exact path="/">
          <Home />
        </Route>
        <Route path="/detail/:id">
          <Detail />
        </Route>
      </Switch>
    </div>
  );
}

export default App;

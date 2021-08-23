import { Link } from 'react-router-dom';

function Home() {
  return (
    <div>
      <div>
        <Link to="/detail/1">Detail 1</Link>
      </div>
      <div>
        <Link to="/detail/2">Detail 2</Link>
      </div>
    </div>
  );
};

export default Home;
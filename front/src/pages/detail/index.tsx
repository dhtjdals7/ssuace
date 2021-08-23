import { useHistory, useParams } from 'react-router-dom';

function Detail() {
  const { goBack } = useHistory();
  const params: { id: string } = useParams();

  return (
    <div>
      <div>Detail {params.id}</div>
      <button onClick={goBack}>GoBack</button>
    </div>
  );
};

export default Detail;
interface ApiResponse<T> {
  status: number;
  message: string;
  data: T;
}

export default ApiResponse;

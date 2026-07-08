"use client";
import Select from "react-select";
import axios from "axios";
import ApiResponse from "../common/ApiResponse";
import React from "react";

type City = {
  id: number;
  name: string;
};

const cities = await axios.get<ApiResponse<City[]>>(
  "http://localhost:8080/api/v1/city/all",
);

export default function Home() {
  const [selectedCity, setSelectedCity] = React.useState<City | null>(null);

  return (
    <div>
      <Select<City>
        options={cities.data.data}
        getOptionLabel={(city) => city.name}
        getOptionValue={(city) => city.id.toString()}
        placeholder="Select a city"
        isClearable
        isSearchable
        value={selectedCity}
        onChange={setSelectedCity}
      />
    </div>
  );
}

"use client";
import Select from "react-select";
import axios from "axios";
import ApiResponse from "../common/ApiResponse";
import React from "react";
import { useQuery } from "@tanstack/react-query";
import Image from "next/image";

type City = {
  id: number;
  name: string;
};

type Cinema = {
  id: number;
  name: string;
  address: string;
  city: City;
  latitude: number;
  longitude: number;
  phone: string;
  email: string;
  image: string;
};

const fetchCity = async (): Promise<City[]> => {
  const response = await axios.get<ApiResponse<City[]>>(
    "http://localhost:8080/api/v1/city/all",
  );
  return response.data.data;
};

const fetchCinemas = async (): Promise<Cinema[]> => {
  const response = await axios.get<ApiResponse<Cinema[]>>(
    "http://localhost:8080/api/v1/cinema/activeCinema",
  );
  return response.data.data;
};

export default function Home() {
  const [selectedCity, setSelectedCity] = React.useState<City | null>(null);
  const {
    data: cities,
    isLoading: isLoadingCities,
    error: citiesError,
  } = useQuery<City[], Error>({
    queryKey: ["cities"],
    queryFn: fetchCity,
  });

  const {
    data: cinemas,
    isLoading: isLoadingCinemas,
    error: cinemasError,
  } = useQuery<Cinema[], Error>({
    queryKey: ["cinemas"],
    queryFn: fetchCinemas,
  });

  if (isLoadingCities || isLoadingCinemas) {
    return <div>Loading...</div>;
  }

  if (citiesError || cinemasError) {
    return <div>Error: {citiesError?.message || cinemasError?.message}</div>;
  }

  return (
    <div>
      <Select<City>
        options={cities || []}
        getOptionLabel={(city) => city.name}
        getOptionValue={(city) => city.id.toString()}
        placeholder="Select a city"
        isClearable
        isSearchable
        value={selectedCity}
        onChange={setSelectedCity}
      />

      <div className="mt-8">
        {cinemas
          ?.filter((cinema) =>
            selectedCity ? cinema.city.id === selectedCity.id : true,
          )
          .map((cinema) => (
            <div key={cinema.id} className="mb-4">
              <h2 className="text-xl font-bold">{cinema.name}</h2>
              <p>{cinema.address}</p>
              <p>{cinema.phone}</p>
              <p>{cinema.email}</p>
              {cinema.image && (
                <Image
                  src={cinema.image}
                  alt={cinema.name}
                  width={300}
                  height={200}
                />
              )}
            </div>
          ))}
      </div>
    </div>
  );
}

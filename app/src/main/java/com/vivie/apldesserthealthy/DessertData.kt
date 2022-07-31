package com.vivie.apldesserthealthy

object DessertData {
    private val id = intArrayOf(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10
    )


    private val title = arrayOf(
        "No Bake Oat Cookies",
                "Banana Ice Cream Cups",
                "Tropical Chia Popsicle",
                "Bola-bola Kurma Coklat",
                "Home-made mangga dan rasberi roll fruit",
                "Es Loli Buah Persik dan Madu",
                "Mousse Alpukat Coklat",
                "Pancake Mangga",
                "Pudding Custard",
                "Es Cincau Pandan"
    )

    private val desc = arrayOf(
            "sehat dan bergizi",
            "delacious",
            "menyehatkan",
            "sehat dan delicious",
            "segar dan bergizi",
            "manis dan menyehatkan",
            "segar",
            "cemilan sehat",
            "bergizi",
            "bergizi",
    )

    private val pembuatan = arrayOf(
        "Campur coconut oil, selai kacang, coconut sugar, bubuk kakao, susu almond, garam, vanilla sampai tercampur merata,Jika sudah tercampur merata, tambahkan oats sambil dicampur kembali,Campur merata agar tidak ad agumpalan dari bubuk kakao dan pastikan campurannya halus,Jika semua bahan-bahan sudah tercampur, cetak adonan sesuai keinginan diatas baki yang dialasi kertas minyak, Masukkan cetakan adonan kedalam kulkas agar mengeras, Saat ini oat cookies sudah bisa dinikmati. Jika ingin menyimpannya untuk kemudian hari, dapat ditempatkan di container dan ditutup rapat.",
        "Blender pisang bekunya sampai lembut, halus dan tanpa potongan pisang yang besar, Pisang yang sudah dihancurkan dapat dicampurkan dengan chocolate chips sampai tercampur merata, Masukkan adonan pisang & chocolate chips kedalam cetakan muffin, dan bekukan sekitar 1-2 jam sebelum dinikmati, Jika ingin dinikmati, de-froze kembali kurang lebih 3 menit sebelum akan dinikmati.",
        "Blender buah naga bersamaan dengan jus cranberry atau jus apel, dan sisihkan, Selanjutnya blender buah mangga dengan jus jeruk, dan sisihkan, Siapkan cetakan popsicle, masukkan puree mangga diikuti dengan chia pudding dan diakhiri dengan puree buah naga, Masukkan kedalam freezer sampai mengeras, dan siap dinikmati.",
        "Campur irisan kurma dengan biskuit, aduk hingga kedua bahan ini tercampur merata. Tambahkan susu kental manis dan margarin cair, lalu aduk lagi hingga merata. Bulatkan adonan, kemudian gulung bola-bola coklat dalam meises atau bahan lain sebagai topping. Dinginkan dalam kulkas selama kurang lebih 15 menit, lalu keluarkan dan hidangkan",
        "Resep ini hanya menggunakan 3 bahan. Kamu cukup haluskan buah manga dan rasberi dengan sedikit gula, tuangkan di atas perkamen. Kemudian biarkan dipanggang dalam oven bersuhu 65oC sampai adonan buah lengket tetapi tidak terlalu lengket atau basah, sekitar 2 hingga 3 jam. Biarkan kulitnya dingin. Keluarkan dari matras dan letakkan di atas selembar kertas lilin. Lalu gulung adonan,Dalam camilan ini terdapat 39 kalori, 0 g lemak, 10 g karbohidrat, 7,5 g gula, 0,5 mg natrium, 2 g serat, 0 g protein. Sehingga cocok untuk kamu buat menjadi ide camilan sehat di sela waktu makan.",
        "Es Loli bisa menjadi camilan yang sangat meyegarkan di siang hari, agar tetap sehat. Buatlah es loli dari buah persik dan madu untuk rasa manis yang alami. Campurkan buah peach, yogurt, dan madu. Lalu masukan ke wadah es loli dan dinginkan. Buah perik mengandung Vitamin A, C, K, zat besi, potasium, kalsium, fluoride, dan beta-karoten. Menjadikan buah persik bermanfaat untuk menghindari resiko kanker, meningkatkan pengelihatan. Tunggu apalagi? Ayo buat ide camilan sehat ini.",
        "Untuk membuat camilan sehat ini, kamu cukup mencampurkan alpukat dan coklat dan blender atau food processor hingga benar-benar halus. Gunakan 3 sdm susu, untuk konsistensi yang lebih halus. Buah Alpukat 100% bebas kolesterol, mengandung hampir 20 vitamin, mineral, dan fitonutrien, dan hanya satu alpukat menawarkan 8% dari nilai serat setiap hari, nutrisi yang memberikan rasa kenyang dan juga telah terbukti berpotensi mengurangi risiko diabetes tipe 2.",
        "Campurkan tepung terigu, garam, dan telur menjadi satu, Tambahkan susu cair secara perlahan-lahan sambil diaduk, Siapkan penggorengan, dadar adonan sampai habis, Isi kulit pancake dengan whipping cream dan mangga, Lipat kulit pancake seperti amplop, Simpan pancake yang sudah jadi di kulkas, Pancake mangga lebih enak dinikmati saat dingi",
        "Campur semua bahan ke dalam panci, Aduk rata semua bahan, Panaskan di atas kompor dengan api sedang sambil terus diaduk hingga mendidih dan mengental, Tuang ke dalam cetakan dan biarkan beku, Tambahkan topping buah di atasnya, Pudding custard siap dihidangkan.",
        "Campur semua bahan (air, gula, pasta pandan) menjadi satu dan aduk rata, Masak dengan api sedang sambil sesekali diaduk sampai mendidih, Matikan api, diamkan sampai uap panasnya hilang, Simpan di dalam kulkas, potong-potong cincau sesuai selera dan masukkan ke dalam campuran minuman, Es Cincau Pandan siap disajikan."

    )

    private val img = intArrayOf(
        R.drawable.abc,
        R.drawable.ab,
        R.drawable.ac,
        R.drawable.ad,
        R.drawable.af,
        R.drawable.ag,
        R.drawable.ah,
        R.drawable.ai,
        R.drawable.aj,
        R.drawable.ak

    )

    val listData: ArrayList<ModelDessert>
        get() {
            val list = arrayListOf<ModelDessert>()
        for (position in id.indices) {
            val Dessert= ModelDessert()
            Dessert.id = id[position]
            Dessert.title = title[position]
            Dessert.desc= desc[position]
            Dessert.pembuatan = pembuatan[position]
            Dessert.img = img[position]

                list.add(Dessert)
        }
            return list
        }

}


